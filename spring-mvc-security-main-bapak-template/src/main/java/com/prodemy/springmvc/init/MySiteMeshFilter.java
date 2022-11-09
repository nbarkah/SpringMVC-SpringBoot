/**
 * 
 */
package com.prodemy.springmvc.init;

import javax.servlet.DispatcherType;
import javax.servlet.annotation.WebFilter;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;

/**
 * @author wyant
 *
 */
@WebFilter(urlPatterns = "/*", dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE, DispatcherType.ERROR})
public class MySiteMeshFilter extends SiteMeshFilter {

}
