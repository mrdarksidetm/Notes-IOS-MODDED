package d6;

import a6.o;
import d6.i;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f9501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j6.m f9502b;

    public static final class a implements i.a<ByteBuffer> {
        @Override // d6.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(ByteBuffer byteBuffer, j6.m mVar, x5.e eVar) {
            return new c(byteBuffer, mVar);
        }
    }

    public c(ByteBuffer byteBuffer, j6.m mVar) {
        this.f9501a = byteBuffer;
        this.f9502b = mVar;
    }

    @Override // d6.i
    public Object a(qd.d<? super h> dVar) {
        try {
            hf.c cVar = new hf.c();
            cVar.write(this.f9501a);
            this.f9501a.position(0);
            return new m(o.a(cVar, this.f9502b.g()), null, a6.d.MEMORY);
        } catch (Throwable th) {
            this.f9501a.position(0);
            throw th;
        }
    }
}
