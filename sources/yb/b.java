package yb;

import java.util.List;
import wb.c0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements e {
    private Boolean h(String str) {
        Object objA = a(str);
        if (objA instanceof Boolean) {
            return (Boolean) objA;
        }
        return null;
    }

    private String j() {
        return (String) a("sql");
    }

    private List<Object> k() {
        return (List) a("arguments");
    }

    @Override // yb.e
    public c0 b() {
        return new c0(j(), k());
    }

    @Override // yb.e
    public boolean c() {
        return Boolean.TRUE.equals(a("noResult"));
    }

    @Override // yb.e
    public Integer d() {
        return (Integer) a("transactionId");
    }

    @Override // yb.e
    public boolean e() {
        return f("transactionId") && d() == null;
    }

    @Override // yb.e
    public Boolean g() {
        return h("inTransaction");
    }

    public boolean i() {
        return Boolean.TRUE.equals(a("continueOnError"));
    }

    public String toString() {
        return getMethod() + " " + j() + " " + k();
    }
}
