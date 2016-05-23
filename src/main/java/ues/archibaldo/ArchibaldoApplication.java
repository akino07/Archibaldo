package ues.archibaldo;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@EnableWebMvc
@SpringBootApplication
public class ArchibaldoApplication extends WebMvcAutoConfiguration{

	//Thymeleaf configuarción
	@Bean(name ="templateResolver")
	public ServletContextTemplateResolver getTemplateResolver() {
		ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/views/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("LEGACYHTML5");
		templateResolver.setCacheable(false);
		return templateResolver;
	}

	@Bean(name ="templateEngine")
	public SpringTemplateEngine getTemplateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(getTemplateResolver());
		templateEngine.addDialect(new LayoutDialect());
		return templateEngine;
	}
	@Bean(name="viewResolver")
	public ThymeleafViewResolver getViewResolver(){
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(getTemplateEngine());
		viewResolver.setViewNames(new String[]{"*.html"});
		return viewResolver;
	}


	public static void main(String[] args) {
		SpringApplication.run(ArchibaldoApplication.class, args);
	}
}
