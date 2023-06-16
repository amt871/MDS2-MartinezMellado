import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-ver_perfil__usuario_registrado_')
export class VistaVer_perfil__usuario_registrado_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; position: absolute;">
 <vaadin-vertical-layout style="width: 100%; height: 5%;">
  <div style="width: 100%; height: 100%;" id="divCabecera"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="" style="width: 100%; height: 20%;">
  <vaadin-horizontal-layout style="width: 100%; height: 100%; align-items: center; justify-content: flex-end;">
   <label id="labelSeguidores">Seguidores</label>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout style="align-items: center; justify-content: center;">
   <img style="width: 30%;" id="image">
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 100%; align-items: center; justify-content: flex-start;">
   <label id="labelMegustas">Me gustas</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <label style="height: 5%;" id="labelUsuario">Usuario</label>
 <vaadin-button style="height: 5%;" id="seguirButton">
   Seguir 
 </vaadin-button>
 <div id="divVideos" style="width: 100%; height: 65%; position: relative;">
  <vaadin-scroller id="Scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
 </div>
 <vaadin-button id="bDenuncia" style="align-self: flex-end;">
  Denunciar
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
