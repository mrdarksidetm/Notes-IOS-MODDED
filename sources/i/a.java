package i;

import ae.r;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: i.a$a, reason: collision with other inner class name */
    public static final class C0292a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f12030a;

        public C0292a(T t10) {
            this.f12030a = t10;
        }

        public final T a() {
            return this.f12030a;
        }
    }

    public abstract Intent createIntent(Context context, I i10);

    public C0292a<O> getSynchronousResult(Context context, I i10) {
        r.f(context, "context");
        return null;
    }

    public abstract O parseResult(int i10, Intent intent);
}
