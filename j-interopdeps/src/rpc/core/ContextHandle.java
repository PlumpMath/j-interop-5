/**
* Donated by Jarapac (http://jarapac.sourceforge.net/) and released under EPL.
* 
* j-Interop (Pure Java implementation of DCOM protocol)
*     
* Copyright (c) 2013 Vikram Roopchand
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* Vikram Roopchand  - Moving to EPL from LGPL v1.
*  
*/

package rpc.core;

import ndr.NdrObject;

public class ContextHandle extends NdrObject {

	int attributes;
	UUID uuid;

    public ContextHandle(int attributes, UUID uuid) {
        setAttributes(attributes);
        setUuid(uuid);
    }

    public int getAttributes() {
		return attributes;
    }

    public void setAttributes(int attributes) {
		this.attributes = attributes;
    }

    public UUID getUuid() {
		return uuid;
    }

    public void setUuid(UUID uuid) {
		this.uuid = uuid;
    }

}
