package com.revenuecat.purchases.common.diagnostics;

import ae.j;
import ae.r;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.utils.Event;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DiagnosticsEntry implements Event {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String NAME_KEY = "name";

    @Deprecated
    public static final String PROPERTIES_KEY = "properties";

    @Deprecated
    public static final String TIMESTAMP_KEY = "timestamp";

    @Deprecated
    public static final int VERSION = 1;

    @Deprecated
    public static final String VERSION_KEY = "version";
    private final DateProvider dateProvider;
    private final Date dateTime;
    private final DiagnosticsEntryName name;
    private final Map<String, Object> properties;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public DiagnosticsEntry(DiagnosticsEntryName diagnosticsEntryName, Map<String, ? extends Object> map, DateProvider dateProvider, Date date) {
        r.f(diagnosticsEntryName, "name");
        r.f(map, PROPERTIES_KEY);
        r.f(dateProvider, "dateProvider");
        r.f(date, "dateTime");
        this.name = diagnosticsEntryName;
        this.properties = map;
        this.dateProvider = dateProvider;
        this.dateTime = date;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DiagnosticsEntry(DiagnosticsEntryName diagnosticsEntryName, Map map, DateProvider dateProvider, Date date, int i10, j jVar) {
        dateProvider = (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider;
        this(diagnosticsEntryName, map, dateProvider, (i10 & 8) != 0 ? dateProvider.getNow() : date);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiagnosticsEntry copy$default(DiagnosticsEntry diagnosticsEntry, DiagnosticsEntryName diagnosticsEntryName, Map map, DateProvider dateProvider, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            diagnosticsEntryName = diagnosticsEntry.name;
        }
        if ((i10 & 2) != 0) {
            map = diagnosticsEntry.properties;
        }
        if ((i10 & 4) != 0) {
            dateProvider = diagnosticsEntry.dateProvider;
        }
        if ((i10 & 8) != 0) {
            date = diagnosticsEntry.dateTime;
        }
        return diagnosticsEntry.copy(diagnosticsEntryName, map, dateProvider, date);
    }

    private final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(VERSION_KEY, 1);
        String lowerCase = this.name.name().toLowerCase(Locale.ROOT);
        r.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        jSONObject.put("name", lowerCase);
        jSONObject.put(PROPERTIES_KEY, new JSONObject(this.properties));
        jSONObject.put(TIMESTAMP_KEY, Iso8601Utils.format(this.dateTime));
        return jSONObject;
    }

    public final DiagnosticsEntryName component1() {
        return this.name;
    }

    public final Map<String, Object> component2() {
        return this.properties;
    }

    public final DateProvider component3() {
        return this.dateProvider;
    }

    public final Date component4() {
        return this.dateTime;
    }

    public final DiagnosticsEntry copy(DiagnosticsEntryName diagnosticsEntryName, Map<String, ? extends Object> map, DateProvider dateProvider, Date date) {
        r.f(diagnosticsEntryName, "name");
        r.f(map, PROPERTIES_KEY);
        r.f(dateProvider, "dateProvider");
        r.f(date, "dateTime");
        return new DiagnosticsEntry(diagnosticsEntryName, map, dateProvider, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiagnosticsEntry)) {
            return false;
        }
        DiagnosticsEntry diagnosticsEntry = (DiagnosticsEntry) obj;
        return this.name == diagnosticsEntry.name && r.b(this.properties, diagnosticsEntry.properties) && r.b(this.dateProvider, diagnosticsEntry.dateProvider) && r.b(this.dateTime, diagnosticsEntry.dateTime);
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final Date getDateTime() {
        return this.dateTime;
    }

    public final DiagnosticsEntryName getName() {
        return this.name;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.properties.hashCode()) * 31) + this.dateProvider.hashCode()) * 31) + this.dateTime.hashCode();
    }

    @Override // com.revenuecat.purchases.utils.Event
    public String toString() {
        String string = toJSONObject().toString();
        r.e(string, "toJSONObject().toString()");
        return string;
    }
}
