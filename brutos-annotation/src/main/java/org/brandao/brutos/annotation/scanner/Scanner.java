/*
 * Brutos Web MVC http://www.brutosframework.com.br/
 * Copyright (C) 2009-2012 Afonso Brandao. (afonso.rbn@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.brandao.brutos.annotation.scanner;

import java.util.List;

/**
 *
 * @author Afonso Brandao
 */
public interface Scanner {

    void scan();

    List<Class> getClassList();
    
    void addIncludeFilter(TypeFilter filter);
    
    void addExcludeFilter(TypeFilter filter);
    
    void removeIncludeFilter(TypeFilter filter);
    
    void removeExcludeFilter(TypeFilter filter);
    
    void setBasePackage(String[] basePackage);
    
}