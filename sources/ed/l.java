package ed;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class l extends sc.p {
    @Override // sc.p
    protected Object g(byte b10, ByteBuffer byteBuffer) {
        ae.r.f(byteBuffer, "buffer");
        if (b10 != -127) {
            return super.g(b10, byteBuffer);
        }
        Object objF = f(byteBuffer);
        List<? extends Object> list = objF instanceof List ? (List) objF : null;
        if (list != null) {
            return e0.f10819c.a(list);
        }
        return null;
    }

    @Override // sc.p
    protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        ae.r.f(byteArrayOutputStream, "stream");
        if (!(obj instanceof e0)) {
            super.p(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(129);
            p(byteArrayOutputStream, ((e0) obj).b());
        }
    }
}
