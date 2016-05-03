package io.github.mrcoder.elasticsearch.beat.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class SomeComponent {

    @Bean
    public AnotherBean getAnotherBean() {
        return new AnotherBean();
    }
}
