package ua.com.verner.back.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * author trancer
 * since 08.02.2015.
 */
@Component
@Aspect
public class NoResultExceptionAspect {
    private static final Logger logger = Logger.getLogger(NoResultExceptionAspect.class);

    @Before("execution(* ua.com.verner.back.services..*.*(..))")
    public void monitor(JoinPoint joinPoint) {
        logger.debug(joinPoint.getSignature());
        logger.debug(joinPoint.getArgs());
    }

}
