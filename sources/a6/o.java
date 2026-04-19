package a6;

import a6.n;
import ae.s;
import android.content.Context;
import hf.z;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    static final class a extends s implements zd.a<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f629a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f629a = context;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return o6.j.n(this.f629a);
        }
    }

    static final class b extends s implements zd.a<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f630a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f630a = context;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return o6.j.n(this.f630a);
        }
    }

    public static final n a(hf.e eVar, Context context) {
        return new q(eVar, new a(context), null);
    }

    public static final n b(hf.e eVar, Context context, n.a aVar) {
        return new q(eVar, new b(context), aVar);
    }

    public static final n c(z zVar, hf.j jVar, String str, Closeable closeable) {
        return new m(zVar, jVar, str, closeable, null);
    }

    public static /* synthetic */ n d(z zVar, hf.j jVar, String str, Closeable closeable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jVar = hf.j.f11987b;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        return c(zVar, jVar, str, closeable);
    }
}
