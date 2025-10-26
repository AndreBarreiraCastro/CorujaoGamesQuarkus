/* package org.acme.dto;

import org.acme.model.Disco;

public record DiscoResponse(
    Long id,
    String desenvolvedoraDisco,
    String modoJogo
) {

    public static DiscoResponse valueOf(Disco disco) {
        return new DiscoResponse(
            disco.getId(),
            disco.getDesenvolvedoraDisco(),
            disco.getModoJogo());
    }
}
 */