package vf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import uf.x;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<g> f22367a = new ArrayList();

    public static h b() {
        return new h();
    }

    public static h g(List<g> list) {
        h hVar = new h();
        hVar.f22367a.addAll(list);
        return hVar;
    }

    public static h h(g gVar) {
        h hVar = new h();
        hVar.a(gVar);
        return hVar;
    }

    public void a(g gVar) {
        this.f22367a.add(gVar);
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f22367a.size(); i10++) {
            if (i10 != 0) {
                sb2.append('\n');
            }
            sb2.append(this.f22367a.get(i10).a());
        }
        return sb2.toString();
    }

    public List<g> d() {
        return this.f22367a;
    }

    public List<x> e() {
        ArrayList arrayList = new ArrayList();
        Iterator<g> it = this.f22367a.iterator();
        while (it.hasNext()) {
            x xVarB = it.next().b();
            if (xVarB != null) {
                arrayList.add(xVarB);
            }
        }
        return arrayList;
    }

    public boolean f() {
        return this.f22367a.isEmpty();
    }
}
