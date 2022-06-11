package com.example.interceptor.config;

import com.example.interceptor.interceptor.AuthInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@RequiredArgsConstructor
public class MvcConfig implements WebMvcConfigurer {

    private final AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 하위 모든 것만 검사
        // 등록된 순서대를 타게 된고 검사 진행
        // 검사하고 싶은 패턴에 대해서만 addPathPatterns 에서 적용 후 확인
        registry.addInterceptor(authInterceptor).addPathPatterns("/api/private/*");
    }
}
