package com.amazon.a.a.b.b;

import com.amazon.a.a.o.c;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.amazon.a.a.n.a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f7095b = new c("SubmitCrashReportsTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.b.a f7096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<com.amazon.a.a.b.c> f7097d;

    @Override // com.amazon.a.a.n.a.a
    protected void a(h hVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(j jVar) {
        this.f7096c.a(this.f7097d);
    }

    @Override // com.amazon.a.a.n.a.a
    protected String a_() {
        return "submit_crash_reports";
    }

    @Override // com.amazon.a.a.n.a.a
    protected Map<String, Object> b() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<com.amazon.a.a.b.c> it = this.f7097d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        map.put("reports", arrayList);
        return map;
    }

    @Override // com.amazon.a.a.n.a.a
    protected String c() {
        return "1.0";
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean d() {
        return !this.f7097d.isEmpty();
    }

    @Override // com.amazon.a.a.n.a.a
    protected void e() {
        this.f7097d = this.f7096c.a();
        if (c.f7483a) {
            c cVar = f7095b;
            cVar.a("--------------- Crash Reports -------------------");
            cVar.a("Size: " + this.f7097d.size());
            cVar.a("--------------------------------------------------");
        }
    }
}
