package org.structure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.structure.repository.HomesteadRepository.BuildingRepository;


@SpringBootApplication
@EnableJpaRepositories("org.structure.repository")
@EntityScan("org.structure.persistence")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer/*doar pt Controller/Thymeleaf*/ {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/");
    }

//    @Bean("uthred")
//    public Warlord selectUthred() {
//        Warlord uthred = new Warlord();
//        uthred.setProvinceOfOriginName("Northumbria");
//        uthred.setFirstName("Uthred");
//        return uthred;
//    }
//
//    @Bean("alfred")
//    public Warlord selectWestSaxon() {
//        return new Warlord();
//    }
//
//    @Bean("uthred_s_household")
//    public WarbandEntity create_Uthred_s_Household() {
//        WarbandEntity uthred_s_household = new WarbandEntity();
//        uthred_s_household.setName("Uthred's Household");
//        uthred_s_household.getWarriorsList().add(selectUthred());
//        return uthred_s_household;
//    }
//
//    @Bean("alfred_s_household")
//    public WarbandEntity create_Alfred_s_Household() {
//        return new WarbandEntity();
//    }


    //toate 4 beans de mai jos e pt internationalizare
//    @Bean
//    public LocaleResolver localeResolver() {
//        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//        localeResolver.setDefaultLocale(Locale.ENGLISH);
//        return localeResolver;
//    }
//
//    @Bean
//    public LocaleChangeInterceptor localeChangeInterceptor() {
//        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
//        localeChangeInterceptor.setParamName("language");
//        return localeChangeInterceptor;
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(localeChangeInterceptor());
//    }
//
//    @Bean
//    public MessageSource messageSource() {
//        ReloadableResourceBundleMessageSource rrbm = new ReloadableResourceBundleMessageSource();
//        rrbm.setBasename("classpath:/message");
//        return rrbm;
//    }

//    @Autowired
//    public void testBuilding(BuildingRepository buildingRepository){
//
//        System.out.println(buildingRepository.getOne(1).toString());
//
//    }
//
//    @Autowired
//    public void testSoldier(SoldierServices soldierServices){
//
////        soldierServices.recruitInfantry();
////        soldierServices.recruitCavalry();
//        soldierServices.recruitArcher();
//    }

}
