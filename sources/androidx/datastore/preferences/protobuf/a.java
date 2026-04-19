package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0088a;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.n0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0088a<MessageType, BuilderType>> implements n0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0088a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0088a<MessageType, BuilderType>> implements n0.a {
        protected static <T> void j(Iterable<T> iterable, List<? super T> list) {
            y.a(iterable);
            if (!(iterable instanceof e4.d)) {
                if (iterable instanceof u0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    k(iterable, list);
                    return;
                }
            }
            List<?> listI = ((e4.d) iterable).i();
            e4.d dVar = (e4.d) list;
            int size = list.size();
            for (Object obj : listI) {
                if (obj == null) {
                    String str = "Element at index " + (dVar.size() - size) + " is null.";
                    for (int size2 = dVar.size() - 1; size2 >= size; size2--) {
                        dVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof g) {
                    dVar.c((g) obj);
                } else {
                    dVar.add((String) obj);
                }
            }
        }

        private static <T> void k(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        protected static e4.h p(n0 n0Var) {
            return new e4.h(n0Var);
        }

        protected abstract BuilderType m(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.n0.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public BuilderType l(n0 n0Var) {
            if (b().getClass().isInstance(n0Var)) {
                return (BuilderType) m((a) n0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        AbstractC0088a.j(iterable, list);
    }

    private String m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public g d() {
        try {
            g.h hVarU = g.u(e());
            f(hVarU.b());
            return hVarU.a();
        } catch (IOException e10) {
            throw new RuntimeException(m("ByteString"), e10);
        }
    }

    int j() {
        throw new UnsupportedOperationException();
    }

    int k(z0 z0Var) {
        int iJ = j();
        if (iJ != -1) {
            return iJ;
        }
        int iG = z0Var.g(this);
        o(iG);
        return iG;
    }

    e4.h n() {
        return new e4.h(this);
    }

    void o(int i10) {
        throw new UnsupportedOperationException();
    }

    public void p(OutputStream outputStream) {
        j jVarF0 = j.f0(outputStream, j.I(e()));
        f(jVarF0);
        jVarF0.c0();
    }
}
