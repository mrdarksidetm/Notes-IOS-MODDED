package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import ge.o;
import java.util.LinkedHashMap;
import java.util.Map;
import nd.q0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class VariableProcessor$VariableName$Companion$valueMap$2 extends s implements a<Map<String, ? extends VariableProcessor.VariableName>> {
    public static final VariableProcessor$VariableName$Companion$valueMap$2 INSTANCE = new VariableProcessor$VariableName$Companion$valueMap$2();

    VariableProcessor$VariableName$Companion$valueMap$2() {
        super(0);
    }

    @Override // zd.a
    public final Map<String, ? extends VariableProcessor.VariableName> invoke() {
        VariableProcessor.VariableName[] variableNameArrValues = VariableProcessor.VariableName.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(o.d(q0.b(variableNameArrValues.length), 16));
        for (VariableProcessor.VariableName variableName : variableNameArrValues) {
            linkedHashMap.put(variableName.getIdentifier(), variableName);
        }
        return linkedHashMap;
    }
}
