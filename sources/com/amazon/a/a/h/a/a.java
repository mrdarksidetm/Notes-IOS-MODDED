package com.amazon.a.a.h.a;

import com.amazon.a.a.h.b;
import com.amazon.a.a.o.c;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.amazon.a.a.n.a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f7160b = new c("SubmitMetricsTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c f7161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f7162d;

    @Override // com.amazon.a.a.n.a.a
    protected void a(h hVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(j jVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    protected String a_() {
        return "submit_metrics";
    }

    @Override // com.amazon.a.a.n.a.a
    protected Map<String, Object> b() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(this.f7162d.c());
        Iterator<com.amazon.a.a.h.a> it = this.f7162d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        map.put("metrics", arrayList);
        return map;
    }

    @Override // com.amazon.a.a.n.a.a
    protected String c() {
        return "1.0";
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean d() {
        return !this.f7162d.a();
    }

    @Override // com.amazon.a.a.n.a.a
    protected void e() {
        this.f7162d = this.f7161c.a();
        if (c.f7483a) {
            c cVar = f7160b;
            cVar.a("--------------- SUBMIT METRICS -------------------");
            cVar.a("Size: " + this.f7162d.c());
            cVar.a("--------------------------------------------------");
        }
    }
}
