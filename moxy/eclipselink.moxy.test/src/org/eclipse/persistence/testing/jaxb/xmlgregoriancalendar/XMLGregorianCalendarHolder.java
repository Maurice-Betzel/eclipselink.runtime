/*******************************************************************************
 * Copyright (c) 2011, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *    Denise Smith - February 20, 2013
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.xmlgregoriancalendar;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement(name="root")
public class XMLGregorianCalendarHolder {

    public Object thing;
    public List<Object> things;
    public XMLGregorianCalendar gregCal;
    public XMLGregorianCalendar gregCalTime;

    public boolean equals(Object obj){
        if(obj instanceof XMLGregorianCalendarHolder){
            XMLGregorianCalendarHolder compare = (XMLGregorianCalendarHolder)obj;
            if(!thing.equals(compare.thing)){
                return false;
            }
            if(!things.equals(compare.things)){
                return false;
            }
            if(!gregCal.equals(compare.gregCal)){
                return false;
            }
            if(!gregCalTime.equals(compare.gregCalTime)){
                return false;
            }
            return true;
        }
        return false;
    }
}
