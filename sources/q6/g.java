package q6;

import ae.r;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import sc.p;

/* JADX INFO: loaded from: classes.dex */
class g extends p {
    @Override // sc.p
    protected Object g(byte b10, ByteBuffer byteBuffer) {
        r.f(byteBuffer, "buffer");
        if (b10 == -127) {
            Object objF = f(byteBuffer);
            List<? extends Object> list = objF instanceof List ? (List) objF : null;
            if (list != null) {
                return b.f18988f.a(list);
            }
            return null;
        }
        if (b10 != -126) {
            return super.g(b10, byteBuffer);
        }
        Object objF2 = f(byteBuffer);
        List<? extends Object> list2 = objF2 instanceof List ? (List) objF2 : null;
        if (list2 != null) {
            return c.f18994c.a(list2);
        }
        return null;
    }

    @Override // sc.p
    protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        List<Object> listA;
        r.f(byteArrayOutputStream, "stream");
        if (obj instanceof b) {
            byteArrayOutputStream.write(129);
            listA = ((b) obj).a();
        } else if (!(obj instanceof c)) {
            super.p(byteArrayOutputStream, obj);
            return;
        } else {
            byteArrayOutputStream.write(130);
            listA = ((c) obj).a();
        }
        p(byteArrayOutputStream, listA);
    }
}
