package ues.archibaldo;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import java.util.HashSet;
import java.util.Set;

@EnableWebMvc
@SpringBootApplication
public class ArchibaldoApplication extends WebMvcAutoConfiguration{


	//TODO MOVER CONFIGURACION DE THYMELEAF A UNA CLASE APARTE
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

	@Bean(name ="templateResolverMensajes")
	public ServletContextTemplateResolver getTemplateResolverMensajes() {
		ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/views/mensajes/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("LEGACYHTML5");
		templateResolver.setCacheable(false);
		return templateResolver;
	}

	@Bean(name ="templateResolverPermisos")
	public ServletContextTemplateResolver getTemplateResolverPermisos() {
		ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/views/permisos/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("LEGACYHTML5");
		templateResolver.setCacheable(false);
		return templateResolver;
	}

	@Bean(name ="templateResolverEstadisticas")
	public ServletContextTemplateResolver getTemplateResolverEstadisticas() {
		ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/views/estadisticas/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("LEGACYHTML5");
		templateResolver.setCacheable(false);
		return templateResolver;
	}

	@Bean(name ="templateResolverAdmin")
	public ServletContextTemplateResolver getTemplateResolverAdministracion() {
		ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/views/administracion/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("LEGACYHTML5");
		templateResolver.setCacheable(false);
		return templateResolver;
	}

	@Bean(name ="templateResolverMaestros")
	public ServletContextTemplateResolver getTemplateResolverMaestros() {
		ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/views/maestros/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("LEGACYHTML5");
		templateResolver.setCacheable(false);
		return templateResolver;
	}

	@Bean(name ="templateEngine")
	public SpringTemplateEngine getTemplateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		Set<ServletContextTemplateResolver> servletContextTemplateResolvers = new HashSet<>();


		//IR AÑADIENDO CADA  templateResolver
		servletContextTemplateResolvers.add(getTemplateResolver());
		servletContextTemplateResolvers.add(getTemplateResolverMensajes());
		servletContextTemplateResolvers.add(getTemplateResolverPermisos());
		servletContextTemplateResolvers.add(getTemplateResolverAdministracion());
		servletContextTemplateResolvers.add(getTemplateResolverEstadisticas());
		servletContextTemplateResolvers.add(getTemplateResolverMaestros());

		templateEngine.setTemplateResolvers(servletContextTemplateResolvers);
//		templateEngine.setTemplateResolver(getTemplateResolver());
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
