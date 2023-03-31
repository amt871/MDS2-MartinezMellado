import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_usuario_no_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-me_gusta__no_registrado_';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_me_gustas__no_registrado_')
export class VistaVer_me_gustas__no_registrado_ extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-cabecera_usuario_no_registrado style="width: 100%; height: 5%;"></vista-cabecera_usuario_no_registrado>
 <vaadin-horizontal-layout style="height: 95%; width: 100%;">
  <vaadin-vertical-layout style="height: 100%; width: 60%; justify-content: center; align-items: center;">
   <img style="height: 100%; width: 100%;" src="../../resources/icons/video.svg">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; width: 40%; justify-content: center; align-items: center;">
   <img style="height: 20%; width: 100%;" src="../../resources/icons/user.svg">
   <label>Usuario</label>
   <vista-me_gusta__no_registrado_ style="width: 90%; height: 40%;"></vista-me_gusta__no_registrado_>
   <vaadin-horizontal-layout style="width: 90%; justify-content: flex-start; align-items: center;">
    <vaadin-button style="margin-top: var(--lumo-space-l);">
      Atras 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
