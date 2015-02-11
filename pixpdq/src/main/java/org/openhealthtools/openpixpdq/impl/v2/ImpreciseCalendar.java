package org.openhealthtools.openpixpdq.impl.v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ImpreciseCalendar extends GregorianCalendar {
    
    private static final long serialVersionUID = 4906946212494092324L;
    
    private final int precision;
    
    public ImpreciseCalendar(final Calendar c, final int precision) {
        setTime(c.getTime());
        this.precision = precision;
    }
    
    public final int getPrecision() {
        return precision;
    }
}
