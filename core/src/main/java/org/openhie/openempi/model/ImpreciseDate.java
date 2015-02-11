package org.openhie.openempi.model;

import java.util.Date;

import org.openhealthtools.openpixpdq.impl.v2.ImpreciseCalendar;

public class ImpreciseDate extends Date {
    
    private static final long serialVersionUID = 3431681257211737254L;
    
    private final ImpreciseCalendar c;
    
    public ImpreciseDate(final ImpreciseCalendar c) {
        super(c.getTime().getTime());
        this.c = c;
    }
    
    public ImpreciseCalendar getCalendar() {
        return c;
    }
}