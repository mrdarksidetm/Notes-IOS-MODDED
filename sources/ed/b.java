package ed;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements d0 {
    @Override // ed.d0
    public String a(List<String> list) throws IOException {
        ae.r.f(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        ae.r.e(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // ed.d0
    public List<String> b(String str) throws ClassNotFoundException, IOException {
        ae.r.f(str, "listString");
        Object object = new h0(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
        ae.r.d(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) object) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
