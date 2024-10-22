<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
	<link rel="stylesheet" href="http://bit.ly/3WJ5ilK">
	<style>
		
	</style>
</head>
<body>
	<!-- admin/log.jsp -->
	<header>
		<%@ include file="/WEB-INF/views/inc/main_menu.jsp" %>
		<%@ include file="/WEB-INF/views/inc/admin_menu.jsp" %>
	</header>
	
	<h2>관리자 <small>로그</small></h2>
	
	<pre style="padding: 1rem; white-space: pre-wrap;">
	public java.lang.String com.test.nontiles.controller.MemberController.history()
	to {[/member/info.do],methods=[GET]}: There is already 'memberController' bean method
	public java.lang.String com.test.nontiles.controller.MemberController.index() mapped.
	ERROR: org.springframework.web.servlet.DispatcherServlet - Context initialization failed
	org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping': Invocation of init method failed; nested exception is java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'memberController' method 
	public java.lang.String com.test.nontiles.controller.MemberController.history()
	to {[/member/info.do],methods=[GET]}: There is already 'memberController' bean method
	public java.lang.String com.test.nontiles.controller.MemberController.index() mapped.
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1708)
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:581)
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:503)
		at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:317)
		at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222)
		at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:315)
		at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199)
		at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:760)
		at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:869)
		at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:550)
		at org.springframework.web.servlet.FrameworkServlet.configureAndRefreshWebApplicationContext(FrameworkServlet.java:672)
		at org.springframework.web.servlet.FrameworkServlet.createWebApplicationContext(FrameworkServlet.java:638)
		at org.springframework.web.servlet.FrameworkServlet.createWebApplicationContext(FrameworkServlet.java:686)
		at org.springframework.web.servlet.FrameworkServlet.initWebApplicationContext(FrameworkServlet.java:554)
		at org.springframework.web.servlet.FrameworkServlet.initServletBean(FrameworkServlet.java:499)
		at org.springframework.web.servlet.HttpServletBean.init(HttpServletBean.java:172)
		at javax.servlet.GenericServlet.init(GenericServlet.java:143)
		at org.apache.catalina.core.StandardWrapper.initServlet(StandardWrapper.java:984)
		at org.apache.catalina.core.StandardWrapper.loadServlet(StandardWrapper.java:941)
		at org.apache.catalina.core.StandardWrapper.load(StandardWrapper.java:838)
		at org.apache.catalina.core.StandardContext.loadOnStartup(StandardContext.java:4182)
		at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:4482)
		at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164)
		at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1203)
		at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1193)
		at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
		at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
		at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:140)
		at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:749)
		at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:721)
		at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164)
		at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1203)
		at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1193)
		at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	</pre>
	
	
	
	<script>
		
	</script>
	<script>
		
	</script>
</body>
</html>





