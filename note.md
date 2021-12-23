|  表头   | 表头  |
|  ----  | ----  |
| PathMatch | PathMatchConfigurer |
| ContentNegotiation | ContentNegotiationConfigurer |
|  configureAsyncSupport|AsyncSupportConfigurer |
|  configureDefaultServletHandling|DefaultServletHandlerConfigurer |
|  addFormatters|FormatterRegistry |
|  addInterceptors|InterceptorRegistry |
|  addResourceHandlers|ResourceHandlerRegistry |
|  addCorsMappings|CorsRegistry |
|  addViewControllers|ViewControllerRegistry |
|  configureViewResolvers|ViewResolverRegistry |
|  addArgumentResolvers|List\<HandlerMethodArgumentResolver> |
|  addReturnValueHandlers|List\<HandlerMethodReturnValueHandler> |
|  configureMessageConverters|List<HttpMessageConverter<?>> |
|  extendMessageConverters|List<HttpMessageConverter<?>> |
|  configureHandlerExceptionResolvers|List\<HandlerExceptionResolver> |
|  extendHandlerExceptionResolvers|List\<HandlerExceptionResolver> |


IDEA中spring-xxx.xml里引用到java包路径飘红，可能是因为这些包是复制进来或者自动创建的，想要不飘红需要手动在IDEA里一个一个的创建这些包。
