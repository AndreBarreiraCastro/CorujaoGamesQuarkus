/* package org.acme.dto;

import org.acme.model.Cartucho;

public record CartuchoResponse(
    Long id,
    String desenvolvedoraCartucho,
    String modoJogo
) {

    public static CartuchoResponse valueOf(Cartucho cartucho) {
        return new CartuchoResponse(
            cartucho.getId(),
            cartucho.getDesenvolvedoraCartucho(),
            cartucho.getModoJogo());
    }
    
}
 */