//package com.coviam.payment.config;
//
//
//import com.coviam.payment.PaymentServiceApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
//
//import java.util.Properties;
//
//public class WebAppInitializer extends SpringBootServletInitializer {
//
//  private static Properties getProperties() {
//    Properties props = new Properties();
//    props.put("spring.config.location", "file:" + System.getenv("PAYMENT_CONF_DIR") + "payment/");
//    return props;
//  }
//
//  @Override
//  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//    return application.sources(PaymentServiceApplication.class).properties(getProperties());
//  }
//}
