package s2;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import nd.v;
import r2.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f19919a = new b();

    private b() {
    }

    public final Object a(q2.e eVar) {
        ArrayList arrayList = new ArrayList(v.x(eVar, 10));
        Iterator<q2.d> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(g gVar, q2.e eVar) {
        ArrayList arrayList = new ArrayList(v.x(eVar, 10));
        Iterator<q2.d> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        gVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
