package androidx.loader.app;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o4.e;
import o4.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0106a<D> {
        void a(s4.b<D> bVar, D d10);

        s4.b<D> b(int i10, Bundle bundle);

        void c(s4.b<D> bVar);
    }

    public static <T extends e & q> a b(T t10) {
        return new b(t10, t10.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> s4.b<D> c(int i10, Bundle bundle, InterfaceC0106a<D> interfaceC0106a);

    public abstract void d();
}
