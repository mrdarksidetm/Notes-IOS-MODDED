package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<MessageType extends n0> implements e4.f<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o f3498a = o.b();

    private MessageType c(MessageType messagetype) throws z {
        if (messagetype == null || messagetype.i()) {
            return messagetype;
        }
        throw d(messagetype).a().i(messagetype);
    }

    private e4.h d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).n() : new e4.h(messagetype);
    }

    @Override // e4.f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(g gVar, o oVar) {
        return (MessageType) c(f(gVar, oVar));
    }

    public MessageType f(g gVar, o oVar) throws z {
        try {
            h hVarV = gVar.v();
            MessageType messagetypeB = b(hVarV, oVar);
            try {
                hVarV.a(0);
                return messagetypeB;
            } catch (z e10) {
                throw e10.i(messagetypeB);
            }
        } catch (z e11) {
            throw e11;
        }
    }
}
