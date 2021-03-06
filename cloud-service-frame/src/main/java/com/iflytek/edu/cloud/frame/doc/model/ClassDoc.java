/**
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iflytek.edu.cloud.frame.doc.model;

import java.util.ArrayList;
import java.util.List;

import com.iflytek.edu.cloud.frame.utils.EnvUtil;

/**
 * 
 * @author libinsong1204@gmail.com
 *
 */
public class ClassDoc {
	private String version;
	private String serviceName;
	private String serviceDesc;
	private List<MethodDoc> methodDocs = new ArrayList<MethodDoc>();
	private List<JavaBeanDoc> beanDocs = new ArrayList<JavaBeanDoc>();
	
	public ClassDoc() {
		version = EnvUtil.getBuildVersion();
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceDesc() {
		return serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}
	public List<MethodDoc> getMethodDocs() {
		return methodDocs;
	}
	public void setMethodDocs(List<MethodDoc> methodDocs) {
		this.methodDocs = methodDocs;
	}
	public List<JavaBeanDoc> getBeanDocs() {
		return beanDocs;
	}
	public void setBeanDocs(List<JavaBeanDoc> beanDocs) {
		this.beanDocs = beanDocs;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
