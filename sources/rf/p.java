package rf;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, uf.p> f19561a = new LinkedHashMap();

    public void a(uf.p pVar) {
        String strB = tf.c.b(pVar.o());
        if (this.f19561a.containsKey(strB)) {
            return;
        }
        this.f19561a.put(strB, pVar);
    }

    public uf.p b(String str) {
        return this.f19561a.get(tf.c.b(str));
    }
}
