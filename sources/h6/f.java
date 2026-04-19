package h6;

import android.graphics.Bitmap;
import h6.c;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f11849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f11850b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f11851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, Object> f11852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f11853c;

        public a(Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
            this.f11851a = bitmap;
            this.f11852b = map;
            this.f11853c = i10;
        }

        public final Bitmap a() {
            return this.f11851a;
        }

        public final Map<String, Object> b() {
            return this.f11852b;
        }

        public final int c() {
            return this.f11853c;
        }
    }

    public static final class b extends androidx.collection.a<c.b, a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f11854a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, f fVar) {
            super(i10);
            this.f11854a = fVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z10, c.b bVar, a aVar, a aVar2) {
            this.f11854a.f11849a.c(bVar, aVar.a(), aVar.b(), aVar.c());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int sizeOf(c.b bVar, a aVar) {
            return aVar.c();
        }
    }

    public f(int i10, i iVar) {
        this.f11849a = iVar;
        this.f11850b = new b(i10, this);
    }

    @Override // h6.h
    public c.C0289c a(c.b bVar) {
        a aVar = this.f11850b.get(bVar);
        if (aVar != null) {
            return new c.C0289c(aVar.a(), aVar.b());
        }
        return null;
    }

    @Override // h6.h
    public void b(int i10) {
        if (i10 >= 40) {
            e();
            return;
        }
        boolean z10 = false;
        if (10 <= i10 && i10 < 20) {
            z10 = true;
        }
        if (z10) {
            this.f11850b.trimToSize(g() / 2);
        }
    }

    @Override // h6.h
    public void c(c.b bVar, Bitmap bitmap, Map<String, ? extends Object> map) {
        int iA = o6.a.a(bitmap);
        if (iA <= f()) {
            this.f11850b.put(bVar, new a(bitmap, map, iA));
        } else {
            this.f11850b.remove(bVar);
            this.f11849a.c(bVar, bitmap, map, iA);
        }
    }

    public void e() {
        this.f11850b.evictAll();
    }

    public int f() {
        return this.f11850b.maxSize();
    }

    public int g() {
        return this.f11850b.size();
    }
}
