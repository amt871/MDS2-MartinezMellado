import { LitElement, html, css, customElement } from 'lit-element';
import './vista-mi_cabecera';
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center;">
 <vista-mi_cabecera style="width: 100%; height: 5%;"></vista-mi_cabecera>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center;">
  <label>Numero de seguidores</label>
  <vaadin-vertical-layout theme="spacing" style="align-items: center;">
   <img id="idImagen" style="height: 100%; width: 50%;" src="../../resources/icons/user.svg">
   <label>Usuario </label>
  </vaadin-vertical-layout>
  <label>Numero de me gustas</label>
 </vaadin-horizontal-layout>
 <vaadin-button>
   Configurar 
 </vaadin-button>
 <vista-mi_video style="width: 100%; height: 100%; align-self: center;"></vista-mi_video>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
