package ru.shatrov.servicedesk;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * Created on 11.12.2020.
 *
 * @author Shatrov Aleksandr
 */
@Configuration(proxyBeanMethods = false)
public class RepositoryMetricsConfiguration {

    @Bean
    public RepoMetricsPostProcessor repoMetricsPostProcessor() {
        return new RepoMetricsPostProcessor();
    }

    static class RepoMetricsPostProcessor implements BeanPostProcessor {
        @Override
        public Object postProcessBeforeInitialization(Object bean, String beanName) {
            if (bean instanceof RepositoryFactoryBeanSupport) {
                RepositoryFactoryBeanSupport<?, ?, ?> repositoryFactoryBean = (RepositoryFactoryBeanSupport<?, ?, ?>) bean;
                repositoryFactoryBean.addRepositoryFactoryCustomizer(repositoryFactory -> repositoryFactory.addInvocationListener(System.out::println));
            }
            return bean;
        }
    }
}
