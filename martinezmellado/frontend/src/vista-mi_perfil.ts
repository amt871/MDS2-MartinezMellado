import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mi_cabecera';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-mi_cabecera style="width: 100%; height: 5%;"></vista-mi_cabecera>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center;">
  <label>Numero de seguidores</label>
  <vaadin-vertical-layout theme="spacing" style="align-items: center;">
   <img id="idImagen" style="width: 40%; height: 40%;" src="../../resources/icons/user.svg">
   <label>Usuario </label>
  </vaadin-vertical-layout>
  <label>Numero de me gustas</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
