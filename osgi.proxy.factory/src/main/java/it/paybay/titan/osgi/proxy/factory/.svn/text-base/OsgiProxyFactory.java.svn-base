package it.paybay.titan.osgi.proxy.factory;

import java.util.List;

import org.aopalliance.aop.Advice;

public interface OsgiProxyFactory {

	/**
	 * Create a proxy object from target, advice and interfaces
	 * @param target
	 * @param advice
	 * @param classes
	 * @return
	 */
	public Object createProxy(Object target, Advice advice,	Class<?>... interfaces);

	/**
	 * Create a proxy object from target, advices and interfaces
	 * @param target
	 * @param advices
	 * @param classes
	 * @return
	 */
	public Object createProxy(Object target, List<Advice> advices,	Class<?>... interfaces);

}