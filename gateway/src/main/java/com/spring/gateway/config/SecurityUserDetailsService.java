package com.spring.gateway.config;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class SecurityUserDetailsService implements ReactiveUserDetailsService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Override
    public Mono<UserDetails> findByUsername(String username) {
       //todo 预留调用数据库根据用户名获取用户
        if (StringUtils.isBlank(username))
            return Mono.error(new UsernameNotFoundException("username Not Null"));
        String token = stringRedisTemplate.opsForValue().get(username);

        if(!StringUtils.isBlank(token)){
            UserDetails user = User.withUsername(username)
                    .password(token)
                    .roles("admin,user").
                            authorities(AuthorityUtils.commaSeparatedStringToAuthorityList("user"))
                    .build();
            return Mono.just(user);
        }else{
            return Mono.error(new UsernameNotFoundException("User Not Found"));

        }

    }



}
