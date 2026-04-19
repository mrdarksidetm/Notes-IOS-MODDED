package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.n0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w.a;
import androidx.datastore.preferences.protobuf.y;
import c4.f;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class w<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected g1 unknownFields = g1.e();
    protected int memoizedSerializedSize = -1;

    public static abstract class a<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0088a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f3750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f3751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected boolean f3752c = false;

        protected a(MessageType messagetype) {
            this.f3750a = messagetype;
            this.f3751b = (MessageType) messagetype.t(f.NEW_MUTABLE_INSTANCE);
        }

        private void z(MessageType messagetype, MessageType messagetype2) {
            v0.a().e(messagetype).a(messagetype, messagetype2);
        }

        @Override // androidx.datastore.preferences.protobuf.n0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) y();
            if (messagetype.i()) {
                return messagetype;
            }
            throw a.AbstractC0088a.p(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.n0.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public MessageType y() {
            if (this.f3752c) {
                return this.f3751b;
            }
            this.f3751b.C();
            this.f3752c = true;
            return this.f3751b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            f.a aVar = (BuilderType) b().g();
            aVar.x(y());
            return aVar;
        }

        protected void t() {
            if (this.f3752c) {
                MessageType messagetype = (MessageType) this.f3751b.t(f.NEW_MUTABLE_INSTANCE);
                z(messagetype, this.f3751b);
                this.f3751b = messagetype;
                this.f3752c = false;
            }
        }

        @Override // e4.e
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public MessageType b() {
            return this.f3750a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0088a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public BuilderType m(MessageType messagetype) {
            return (BuilderType) x(messagetype);
        }

        public BuilderType x(MessageType messagetype) {
            t();
            z(this.f3751b, messagetype);
            return this;
        }
    }

    protected static class b<T extends w<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f3753b;

        public b(T t10) {
            this.f3753b = t10;
        }

        @Override // e4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T b(h hVar, o oVar) {
            return (T) w.H(this.f3753b, hVar, oVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends w<MessageType, BuilderType> implements e4.e {
        protected t<d> extensions = t.h();

        t<d> K() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.w, e4.e
        public /* bridge */ /* synthetic */ n0 b() {
            return super.b();
        }

        @Override // androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.n0
        public /* bridge */ /* synthetic */ n0.a c() {
            return super.c();
        }

        @Override // androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.n0
        public /* bridge */ /* synthetic */ n0.a g() {
            return super.g();
        }
    }

    static final class d implements t.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final y.d<?> f3754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f3755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final k1.b f3756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f3757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f3758e;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f3755b - dVar.f3755b;
        }

        public y.d<?> b() {
            return this.f3754a;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public int d() {
            return this.f3755b;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public boolean e() {
            return this.f3757d;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public k1.b f() {
            return this.f3756c;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public k1.c g() {
            return this.f3756c.a();
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public boolean h() {
            return this.f3758e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.t.b
        public n0.a k(n0.a aVar, n0 n0Var) {
            return ((a) aVar).x((w) n0Var);
        }
    }

    public static class e<ContainingType extends n0, Type> extends m<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n0 f3759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d f3760b;

        public k1.b a() {
            return this.f3760b.f();
        }

        public n0 b() {
            return this.f3759a;
        }

        public int c() {
            return this.f3760b.d();
        }

        public boolean d() {
            return this.f3760b.f3757d;
        }
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    static Object A(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends w<T, ?>> boolean B(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.t(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = v0.a().e(t10).d(t10);
        if (z10) {
            t10.u(f.SET_MEMOIZED_IS_INITIALIZED, zD ? t10 : null);
        }
        return zD;
    }

    protected static <E> y.i<E> D(y.i<E> iVar) {
        int size = iVar.size();
        return iVar.g(size == 0 ? 10 : size * 2);
    }

    protected static Object F(n0 n0Var, String str, Object[] objArr) {
        return new x0(n0Var, str, objArr);
    }

    protected static <T extends w<T, ?>> T G(T t10, InputStream inputStream) {
        return (T) r(H(t10, h.f(inputStream), o.b()));
    }

    static <T extends w<T, ?>> T H(T t10, h hVar, o oVar) throws z {
        T t11 = (T) t10.t(f.NEW_MUTABLE_INSTANCE);
        try {
            z0 z0VarE = v0.a().e(t11);
            z0VarE.b(t11, i.Q(hVar), oVar);
            z0VarE.c(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof z) {
                throw ((z) e10.getCause());
            }
            throw new z(e10.getMessage()).i(t11);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof z) {
                throw ((z) e11.getCause());
            }
            throw e11;
        }
    }

    protected static <T extends w<?, ?>> void I(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends w<T, ?>> T r(T t10) throws z {
        if (t10 == null || t10.i()) {
            return t10;
        }
        throw t10.n().a().i(t10);
    }

    protected static <E> y.i<E> w() {
        return w0.d();
    }

    static <T extends w<?, ?>> T x(Class<T> cls) {
        w<?, ?> wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (wVar == null) {
            wVar = (T) ((w) i1.i(cls)).b();
            if (wVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, wVar);
        }
        return (T) wVar;
    }

    protected void C() {
        v0.a().e(this).c(this);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final BuilderType g() {
        return (BuilderType) t(f.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final BuilderType c() {
        BuilderType buildertype = (BuilderType) t(f.NEW_BUILDER);
        buildertype.x(this);
        return buildertype;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public int e() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = v0.a().e(this).g(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (b().getClass().isInstance(obj)) {
            return v0.a().e(this).f(this, (w) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public void f(j jVar) {
        v0.a().e(this).e(this, k.P(jVar));
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final e4.f<MessageType> h() {
        return (e4.f) t(f.GET_PARSER);
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int i11 = v0.a().e(this).i(this);
        this.memoizedHashCode = i11;
        return i11;
    }

    @Override // e4.e
    public final boolean i() {
        return B(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int j() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    void o(int i10) {
        this.memoizedSerializedSize = i10;
    }

    Object q() {
        return t(f.BUILD_MESSAGE_INFO);
    }

    protected final <MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType s() {
        return (BuilderType) t(f.NEW_BUILDER);
    }

    protected Object t(f fVar) {
        return v(fVar, null, null);
    }

    public String toString() {
        return o0.e(this, super.toString());
    }

    protected Object u(f fVar, Object obj) {
        return v(fVar, obj, null);
    }

    protected abstract Object v(f fVar, Object obj, Object obj2);

    @Override // e4.e
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final MessageType b() {
        return (MessageType) t(f.GET_DEFAULT_INSTANCE);
    }
}
