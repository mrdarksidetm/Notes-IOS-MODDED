package com.revenuecat.purchases.paywalls.components;

import ae.r;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import we.b;
import ye.f;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
final class ActionSerializer implements b<ButtonComponent.Action> {
    public static final ActionSerializer INSTANCE = new ActionSerializer();
    private static final f descriptor = ActionSurrogate.Companion.serializer().getDescriptor();

    private ActionSerializer() {
    }

    @Override // we.a
    public ButtonComponent.Action deserialize(e eVar) {
        r.f(eVar, "decoder");
        return ((ActionSurrogate) eVar.v(ActionSurrogate.Companion.serializer())).toAction();
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ButtonComponent.Action action) {
        r.f(fVar, "encoder");
        r.f(action, "value");
        fVar.D(ActionSurrogate.Companion.serializer(), new ActionSurrogate(action));
    }
}
