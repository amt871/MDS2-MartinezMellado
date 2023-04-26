import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mi_video';

@customElement('vista-mi_perfil')
export class VistaMi_perfil extends LitElement {
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
 <vaadin-vertical-layout style="height: 5%; width: 100%;">
  <div id="divCabecera" style="width: 100%; height: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center; height: 20%;">
  <label>Numero de seguidores</label>
  <vaadin-vertical-layout theme="spacing" style="align-items: center;">
   <img id="idImagen" style="height: 100%; width: 50%;" src="icons/user.svg">
   <label>Usuario </label>
  </vaadin-vertical-layout>
  <label>Numero de me gustas</label>
 </vaadin-horizontal-layout>
 <vaadin-button style="height: 5%;" id="bConfigurar">
   Configurar 
 </vaadin-button>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 70%;">
  <vista-mi_video style="width: 100%; flex-shrink: 1; height: 100%;"></vista-mi_video>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
