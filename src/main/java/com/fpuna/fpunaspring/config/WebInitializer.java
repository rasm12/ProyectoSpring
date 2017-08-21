//package com.fpuna.fpunaspring.config;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//public class WebInitializer implements WebApplicationInitializer {
//
//    // Se configura el dispatcher
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        // Se crea un contexto basado en anotaciones
//        AnnotationConfigWebApplicationContext annConWebAppCtx = new AnnotationConfigWebApplicationContext();
//
//        // Se configura el paquete de los ficheros de configuración. En el propio paquete!!!
//        annConWebAppCtx.setConfigLocation(this.getClass().getPackage().getName());
//
//        System.out.println("#############################################");
//        System.out.println(this.getClass().getPackage().getName());
//
//        
//
//        // Se configura el contexto utilizado en Securiry
//        annConWebAppCtx.setServletContext(servletContext);
//
//        // Se configura el servlet
//        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(annConWebAppCtx));
//
//        // 1 es True
//        servlet.setLoadOnStartup(1);
//
//        servlet.addMapping("/");
//
//        // Se configura la ruta relativa del servlet
//        //servlet.addMapping(Uris.SERVLET_MAP + "/*");
//    }
//
//}
