package v0;

import ae.j;
import ae.r;
import ie.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import md.i0;
import nd.o;
import sd.i;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class a<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f21842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f21843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21844c;

    /* JADX INFO: renamed from: v0.a$a, reason: collision with other inner class name */
    public static final class C0449a implements Map<Key, Value>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<Key, Value> f21845a;

        /* JADX INFO: renamed from: v0.a$a$a, reason: collision with other inner class name */
        public static final class C0450a implements Set<Map.Entry<? extends Key, ? extends Value>>, be.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a<Key, Value> f21846a;

            /* JADX INFO: renamed from: v0.a$a$a$a, reason: collision with other inner class name */
            @sd.d(c = "androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1", f = "IdentityArrayMap.kt", l = {229}, m = "invokeSuspend")
            static final class C0451a extends i implements p<ie.i<? super Map.Entry<? extends Key, ? extends Value>>, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f21847a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f21848b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f21849c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f21850d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ a<Key, Value> f21851e;

                /* JADX INFO: renamed from: v0.a$a$a$a$a, reason: collision with other inner class name */
                public static final class C0452a implements Map.Entry<Key, Value>, be.a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final Key f21852a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final Value f21853b;

                    C0452a(a<Key, Value> aVar, int i10) {
                        Key key = (Key) aVar.g()[i10];
                        r.d(key, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        this.f21852a = key;
                        this.f21853b = (Value) aVar.i()[i10];
                    }

                    @Override // java.util.Map.Entry
                    public Key getKey() {
                        return this.f21852a;
                    }

                    @Override // java.util.Map.Entry
                    public Value getValue() {
                        return this.f21853b;
                    }

                    @Override // java.util.Map.Entry
                    public Value setValue(Value value) {
                        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0451a(a<Key, Value> aVar, qd.d<? super C0451a> dVar) {
                    super(2, dVar);
                    this.f21851e = aVar;
                }

                @Override // zd.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(ie.i<? super Map.Entry<? extends Key, ? extends Value>> iVar, qd.d<? super i0> dVar) {
                    return ((C0451a) create(iVar, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    C0451a c0451a = new C0451a(this.f21851e, dVar);
                    c0451a.f21850d = obj;
                    return c0451a;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0048 -> B:13:0x004b). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                    /*
                        r8 = this;
                        java.lang.Object r0 = rd.b.e()
                        int r1 = r8.f21849c
                        r2 = 1
                        if (r1 == 0) goto L20
                        if (r1 != r2) goto L18
                        int r1 = r8.f21848b
                        int r3 = r8.f21847a
                        java.lang.Object r4 = r8.f21850d
                        ie.i r4 = (ie.i) r4
                        md.u.b(r9)
                        r9 = r8
                        goto L4b
                    L18:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L20:
                        md.u.b(r9)
                        java.lang.Object r9 = r8.f21850d
                        ie.i r9 = (ie.i) r9
                        r1 = 0
                        v0.a<Key, Value> r3 = r8.f21851e
                        int r3 = r3.h()
                        r4 = r9
                        r9 = r8
                        r7 = r3
                        r3 = r1
                        r1 = r7
                    L33:
                        if (r3 >= r1) goto L4d
                        v0.a$a$a$a$a r5 = new v0.a$a$a$a$a
                        v0.a<Key, Value> r6 = r9.f21851e
                        r5.<init>(r6, r3)
                        r9.f21850d = r4
                        r9.f21847a = r3
                        r9.f21848b = r1
                        r9.f21849c = r2
                        java.lang.Object r5 = r4.c(r5, r9)
                        if (r5 != r0) goto L4b
                        return r0
                    L4b:
                        int r3 = r3 + r2
                        goto L33
                    L4d:
                        md.i0 r9 = md.i0.f15558a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: v0.a.C0449a.C0450a.C0451a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            C0450a(a<Key, Value> aVar) {
                this.f21846a = aVar;
            }

            public boolean a(Map.Entry<? extends Key, ? extends Value> entry) {
                return this.f21846a.f(entry.getKey()) == entry.getValue();
            }

            @Override // java.util.Set, java.util.Collection
            public /* bridge */ /* synthetic */ boolean add(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends Map.Entry<? extends Key, ? extends Value>> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    return a((Map.Entry) obj);
                }
                return false;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection<? extends Object> collection) {
                if ((collection instanceof Collection) && collection.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }

            public int d() {
                return this.f21846a.h();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f21846a.j();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator<Map.Entry<Key, Value>> iterator() {
                return k.b(new C0451a(this.f21846a, null)).iterator();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ int size() {
                return d();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return ae.i.a(this);
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) ae.i.b(this, tArr);
            }
        }

        /* JADX INFO: renamed from: v0.a$a$b */
        public static final class b implements Set<Key>, be.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a<Key, Value> f21854a;

            /* JADX INFO: renamed from: v0.a$a$b$a, reason: collision with other inner class name */
            @sd.d(c = "androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$keys$1$iterator$1", f = "IdentityArrayMap.kt", l = {251}, m = "invokeSuspend")
            static final class C0453a extends i implements p<ie.i<? super Key>, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f21855a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f21856b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f21857c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f21858d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ a<Key, Value> f21859e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0453a(a<Key, Value> aVar, qd.d<? super C0453a> dVar) {
                    super(2, dVar);
                    this.f21859e = aVar;
                }

                @Override // zd.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(ie.i<? super Key> iVar, qd.d<? super i0> dVar) {
                    return ((C0453a) create(iVar, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    C0453a c0453a = new C0453a(this.f21859e, dVar);
                    c0453a.f21858d = obj;
                    return c0453a;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004e -> B:13:0x0051). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                    /*
                        r8 = this;
                        java.lang.Object r0 = rd.b.e()
                        int r1 = r8.f21857c
                        r2 = 1
                        if (r1 == 0) goto L20
                        if (r1 != r2) goto L18
                        int r1 = r8.f21856b
                        int r3 = r8.f21855a
                        java.lang.Object r4 = r8.f21858d
                        ie.i r4 = (ie.i) r4
                        md.u.b(r9)
                        r9 = r8
                        goto L51
                    L18:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L20:
                        md.u.b(r9)
                        java.lang.Object r9 = r8.f21858d
                        ie.i r9 = (ie.i) r9
                        r1 = 0
                        v0.a<Key, Value> r3 = r8.f21859e
                        int r3 = r3.h()
                        r4 = r9
                        r9 = r8
                        r7 = r3
                        r3 = r1
                        r1 = r7
                    L33:
                        if (r3 >= r1) goto L53
                        v0.a<Key, Value> r5 = r9.f21859e
                        java.lang.Object[] r5 = r5.g()
                        r5 = r5[r3]
                        java.lang.String r6 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
                        ae.r.d(r5, r6)
                        r9.f21858d = r4
                        r9.f21855a = r3
                        r9.f21856b = r1
                        r9.f21857c = r2
                        java.lang.Object r5 = r4.c(r5, r9)
                        if (r5 != r0) goto L51
                        return r0
                    L51:
                        int r3 = r3 + r2
                        goto L33
                    L53:
                        md.i0 r9 = md.i0.f15558a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: v0.a.C0449a.b.C0453a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            b(a<Key, Value> aVar) {
                this.f21854a = aVar;
            }

            public int a() {
                return this.f21854a.h();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(Key key) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends Key> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                if (obj == null) {
                    return false;
                }
                return this.f21854a.c(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection<? extends Object> collection) {
                Iterator<? extends Object> it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f21854a.j();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator<Key> iterator() {
                return k.b(new C0453a(this.f21854a, null)).iterator();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ int size() {
                return a();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return ae.i.a(this);
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) ae.i.b(this, tArr);
            }
        }

        /* JADX INFO: renamed from: v0.a$a$c */
        public static final class c implements Collection<Value>, be.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a<Key, Value> f21860a;

            /* JADX INFO: renamed from: v0.a$a$c$a, reason: collision with other inner class name */
            @sd.d(c = "androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$values$1$iterator$1", f = "IdentityArrayMap.kt", l = {271}, m = "invokeSuspend")
            static final class C0454a extends i implements p<ie.i<? super Value>, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f21861a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f21862b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f21863c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f21864d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ a<Key, Value> f21865e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0454a(a<Key, Value> aVar, qd.d<? super C0454a> dVar) {
                    super(2, dVar);
                    this.f21865e = aVar;
                }

                @Override // zd.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(ie.i<? super Value> iVar, qd.d<? super i0> dVar) {
                    return ((C0454a) create(iVar, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    C0454a c0454a = new C0454a(this.f21865e, dVar);
                    c0454a.f21864d = obj;
                    return c0454a;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0049 -> B:13:0x004c). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                    /*
                        r7 = this;
                        java.lang.Object r0 = rd.b.e()
                        int r1 = r7.f21863c
                        r2 = 1
                        if (r1 == 0) goto L20
                        if (r1 != r2) goto L18
                        int r1 = r7.f21862b
                        int r3 = r7.f21861a
                        java.lang.Object r4 = r7.f21864d
                        ie.i r4 = (ie.i) r4
                        md.u.b(r8)
                        r8 = r7
                        goto L4c
                    L18:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L20:
                        md.u.b(r8)
                        java.lang.Object r8 = r7.f21864d
                        ie.i r8 = (ie.i) r8
                        r1 = 0
                        v0.a<Key, Value> r3 = r7.f21865e
                        int r3 = r3.h()
                        r4 = r8
                        r8 = r7
                        r6 = r3
                        r3 = r1
                        r1 = r6
                    L33:
                        if (r3 >= r1) goto L4e
                        v0.a<Key, Value> r5 = r8.f21865e
                        java.lang.Object[] r5 = r5.i()
                        r5 = r5[r3]
                        r8.f21864d = r4
                        r8.f21861a = r3
                        r8.f21862b = r1
                        r8.f21863c = r2
                        java.lang.Object r5 = r4.c(r5, r8)
                        if (r5 != r0) goto L4c
                        return r0
                    L4c:
                        int r3 = r3 + r2
                        goto L33
                    L4e:
                        md.i0 r8 = md.i0.f15558a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: v0.a.C0449a.c.C0454a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            c(a<Key, Value> aVar) {
                this.f21860a = aVar;
            }

            public int a() {
                return this.f21860a.h();
            }

            @Override // java.util.Collection
            public boolean add(Value value) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean addAll(Collection<? extends Value> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                int iH = this.f21860a.h();
                for (int i10 = 0; i10 < iH; i10++) {
                    if (r.b(this.f21860a.i()[i10], obj)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.Collection
            public boolean containsAll(Collection<? extends Object> collection) {
                Iterator<? extends Object> it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f21860a.j();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public Iterator<Value> iterator() {
                return k.b(new C0454a(this.f21860a, null)).iterator();
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean removeIf(Predicate<? super Value> predicate) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public final /* bridge */ int size() {
                return a();
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return ae.i.a(this);
            }

            @Override // java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) ae.i.b(this, tArr);
            }
        }

        C0449a(a<Key, Value> aVar) {
            this.f21845a = aVar;
        }

        public Set<Map.Entry<Key, Value>> a() {
            return new C0450a(this.f21845a);
        }

        public Set<Key> c() {
            return new b(this.f21845a);
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value compute(Key key, BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value computeIfAbsent(Key key, Function<? super Key, ? extends Value> function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value computeIfPresent(Key key, BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return (obj == null || this.f21845a.f(obj) == null) ? false : true;
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return nd.p.F(this.f21845a.i(), obj);
        }

        public int d() {
            return this.f21845a.h();
        }

        public Collection<Value> e() {
            return new c(this.f21845a);
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Map.Entry<Key, Value>> entrySet() {
            return a();
        }

        @Override // java.util.Map
        public Value get(Object obj) {
            if (obj == null) {
                return null;
            }
            return this.f21845a.f(obj);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f21845a.j();
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Key> keySet() {
            return c();
        }

        @Override // java.util.Map
        public Value merge(Key key, Value value, BiFunction<? super Value, ? super Value, ? extends Value> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value put(Key key, Value value) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void putAll(Map<? extends Key, ? extends Value> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value putIfAbsent(Key key, Value value) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value replace(Key key, Value value) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean replace(Key key, Value value, Value value2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void replaceAll(BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection<Value> values() {
            return e();
        }
    }

    public a(int i10) {
        this.f21842a = new Object[i10];
        this.f21843b = new Object[i10];
    }

    public /* synthetic */ a(int i10, int i11, j jVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    private final int d(Object obj) {
        int iC = t0.c.c(obj);
        int i10 = this.f21844c - 1;
        Object[] objArr = this.f21842a;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = objArr[i12];
            int iC2 = t0.c.c(obj2);
            if (iC2 < iC) {
                i11 = i12 + 1;
            } else {
                if (iC2 <= iC) {
                    return obj == obj2 ? i12 : e(i12, obj, iC);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    private final int e(int i10, Object obj, int i11) {
        Object obj2;
        Object[] objArr = this.f21842a;
        int i12 = this.f21844c;
        for (int i13 = i10 - 1; -1 < i13; i13--) {
            Object obj3 = objArr[i13];
            if (obj3 == obj) {
                return i13;
            }
            if (t0.c.c(obj3) != i11) {
                break;
            }
        }
        do {
            i10++;
            if (i10 >= i12) {
                return -(i12 + 1);
            }
            obj2 = objArr[i10];
            if (obj2 == obj) {
                return i10;
            }
        } while (t0.c.c(obj2) == i11);
        return -(i10 + 1);
    }

    public final Map<Key, Value> a() {
        return new C0449a(this);
    }

    public final void b() {
        this.f21844c = 0;
        o.t(this.f21842a, null, 0, 0, 6, null);
        o.t(this.f21843b, null, 0, 0, 6, null);
    }

    public final boolean c(Key key) {
        return d(key) >= 0;
    }

    public final Value f(Key key) {
        int iD = d(key);
        if (iD >= 0) {
            return (Value) this.f21843b[iD];
        }
        return null;
    }

    public final Object[] g() {
        return this.f21842a;
    }

    public final int h() {
        return this.f21844c;
    }

    public final Object[] i() {
        return this.f21843b;
    }

    public final boolean j() {
        return this.f21844c == 0;
    }

    public final boolean k() {
        return this.f21844c > 0;
    }

    public final void l(Key key, Value value) {
        Object[] objArr = this.f21842a;
        Object[] objArr2 = this.f21843b;
        int i10 = this.f21844c;
        int iD = d(key);
        if (iD >= 0) {
            objArr2[iD] = value;
            return;
        }
        int i11 = -(iD + 1);
        boolean z10 = i10 == objArr.length;
        Object[] objArr3 = z10 ? new Object[i10 * 2] : objArr;
        int i12 = i11 + 1;
        o.h(objArr, objArr3, i12, i11, i10);
        if (z10) {
            o.l(objArr, objArr3, 0, 0, i11, 6, null);
        }
        objArr3[i11] = key;
        this.f21842a = objArr3;
        Object[] objArr4 = z10 ? new Object[i10 * 2] : objArr2;
        o.h(objArr2, objArr4, i12, i11, i10);
        if (z10) {
            o.l(objArr2, objArr4, 0, 0, i11, 6, null);
        }
        objArr4[i11] = value;
        this.f21843b = objArr4;
        this.f21844c++;
    }
}
