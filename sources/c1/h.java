package c1;

import c1.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.v;
import nd.r0;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.l<Object, Boolean> f6296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, List<Object>> f6297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, List<zd.a<Object>>> f6298c;

    public static final class a implements g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.a<Object> f6301c;

        a(String str, zd.a<? extends Object> aVar) {
            this.f6300b = str;
            this.f6301c = aVar;
        }

        @Override // c1.g.a
        public void a() {
            List list = (List) h.this.f6298c.remove(this.f6300b);
            if (list != null) {
                list.remove(this.f6301c);
            }
            if (list == null || !(!list.isEmpty())) {
                return;
            }
            h.this.f6298c.put(this.f6300b, list);
        }
    }

    public h(Map<String, ? extends List<? extends Object>> map, zd.l<Object, Boolean> lVar) {
        Map<String, List<Object>> mapV;
        this.f6296a = lVar;
        this.f6297b = (map == null || (mapV = r0.v(map)) == null) ? new LinkedHashMap<>() : mapV;
        this.f6298c = new LinkedHashMap();
    }

    @Override // c1.g
    public boolean a(Object obj) {
        return this.f6296a.invoke(obj).booleanValue();
    }

    @Override // c1.g
    public Map<String, List<Object>> b() {
        Map<String, List<Object>> mapV = r0.v(this.f6297b);
        for (Map.Entry<String, List<zd.a<Object>>> entry : this.f6298c.entrySet()) {
            String key = entry.getKey();
            List<zd.a<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object objInvoke = value.get(0).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        throw new IllegalStateException("item can't be saved".toString());
                    }
                    mapV.put(key, u.g(objInvoke));
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objInvoke2 = value.get(i10).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        throw new IllegalStateException("item can't be saved".toString());
                    }
                    arrayList.add(objInvoke2);
                }
                mapV.put(key, arrayList);
            }
        }
        return mapV;
    }

    @Override // c1.g
    public Object c(String str) {
        List<Object> listRemove = this.f6297b.remove(str);
        if (listRemove == null || !(!listRemove.isEmpty())) {
            return null;
        }
        if (listRemove.size() > 1) {
            this.f6297b.put(str, listRemove.subList(1, listRemove.size()));
        }
        return listRemove.get(0);
    }

    @Override // c1.g
    public g.a d(String str, zd.a<? extends Object> aVar) {
        if (!(!v.v(str))) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        Map<String, List<zd.a<Object>>> map = this.f6298c;
        List<zd.a<Object>> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        arrayList.add(aVar);
        return new a(str, aVar);
    }
}
