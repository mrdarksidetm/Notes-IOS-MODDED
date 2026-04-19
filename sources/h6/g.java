package h6;

import ae.j;
import android.graphics.Bitmap;
import h6.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import nd.c0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11855c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<c.b, ArrayList<b>> f11856a = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11857b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<Bitmap> f11859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, Object> f11860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f11861d;

        public b(int i10, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i11) {
            this.f11858a = i10;
            this.f11859b = weakReference;
            this.f11860c = map;
            this.f11861d = i11;
        }

        public final WeakReference<Bitmap> a() {
            return this.f11859b;
        }

        public final Map<String, Object> b() {
            return this.f11860c;
        }

        public final int c() {
            return this.f11858a;
        }

        public final int d() {
            return this.f11861d;
        }
    }

    private final void e() {
        int i10 = this.f11857b;
        this.f11857b = i10 + 1;
        if (i10 >= 10) {
            d();
        }
    }

    @Override // h6.i
    public synchronized c.C0289c a(c.b bVar) {
        ArrayList<b> arrayList = this.f11856a.get(bVar);
        c.C0289c c0289c = null;
        if (arrayList == null) {
            return null;
        }
        int i10 = 0;
        int size = arrayList.size();
        while (true) {
            if (i10 >= size) {
                break;
            }
            b bVar2 = arrayList.get(i10);
            Bitmap bitmap = bVar2.a().get();
            c.C0289c c0289c2 = bitmap != null ? new c.C0289c(bitmap, bVar2.b()) : null;
            if (c0289c2 != null) {
                c0289c = c0289c2;
                break;
            }
            i10++;
        }
        e();
        return c0289c;
    }

    @Override // h6.i
    public synchronized void b(int i10) {
        if (i10 >= 10 && i10 != 20) {
            d();
        }
    }

    @Override // h6.i
    public synchronized void c(c.b bVar, Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
        LinkedHashMap<c.b, ArrayList<b>> linkedHashMap = this.f11856a;
        ArrayList<b> arrayList = linkedHashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(bVar, arrayList);
        }
        ArrayList<b> arrayList2 = arrayList;
        int iIdentityHashCode = System.identityHashCode(bitmap);
        b bVar2 = new b(iIdentityHashCode, new WeakReference(bitmap), map, i10);
        int i11 = 0;
        int size = arrayList2.size();
        while (true) {
            if (i11 >= size) {
                arrayList2.add(bVar2);
                break;
            }
            b bVar3 = arrayList2.get(i11);
            if (i10 < bVar3.d()) {
                i11++;
            } else if (bVar3.c() == iIdentityHashCode && bVar3.a().get() == bitmap) {
                arrayList2.set(i11, bVar2);
            } else {
                arrayList2.add(i11, bVar2);
            }
        }
        e();
    }

    public final void d() {
        WeakReference<Bitmap> weakReferenceA;
        this.f11857b = 0;
        Iterator<ArrayList<b>> it = this.f11856a.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                b bVar = (b) c0.a0(next);
                if (((bVar == null || (weakReferenceA = bVar.a()) == null) ? null : weakReferenceA.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (next.get(i12).a().get() == null) {
                        next.remove(i12);
                        i10++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
