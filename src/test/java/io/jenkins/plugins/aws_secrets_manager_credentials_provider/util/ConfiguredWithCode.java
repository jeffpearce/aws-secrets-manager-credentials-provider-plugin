package io.jenkins.plugins.aws_secrets_manager_credentials_provider.util;

import org.junit.Test;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Taken from https://github.com/jenkinsci/configuration-as-code-plugin/ (MIT license)
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface ConfiguredWithCode {

    /**
     * resource path in classpath
     */
    String[] value();

    Class<? extends Throwable> expected() default Test.None.class;

    String message() default "";
}