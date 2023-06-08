import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_perfil_privado__usuario_registrado_')
export class VistaVer_perfil_privado__usuario_registrado_ extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute; align-items: center;">
 <vaadin-vertical-layout style="width: 100%; height: 5%;">
  <div style="width: 100%; height: 100%;" id="divCabecera"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 20%; justify-content: center; align-items: center;">
  <vaadin-horizontal-layout style="align-items: center; justify-content: flex-end; width: 100%; height: 100%;">
   <label id="labelSeguidores">Seguidores</label>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout style="align-items: center; justify-content: center;">
   <img style="width: 30%;" id="Image">
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 100%; justify-content: flex-start; align-items: center;">
   <label id="labelMegustas">Me gustas</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <label style="height: 5%;" id="labelUsuario">Usuario</label>
 <vaadin-button style="height: 5%;">
   Seguir 
 </vaadin-button>
 <label style="height: 5%;">Usuario privado</label>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
