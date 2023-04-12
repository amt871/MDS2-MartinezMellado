import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mi_cabecera';
import './vista-mis_me_gusta';
import './vista-comentario';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-configurar';

@customElement('vista-ver_mi_video')
export class VistaVer_mi_video extends LitElement {
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
 <vista-mi_cabecera style="width: 100%; height: 5%;"></vista-mi_cabecera>
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 100%; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 50%; align-items: center;">
    <img style="width: 50%; height: 100%;" src="../../resources/icons/video.svg">
    <label>Descripcion</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 40%;">
    <vaadin-vertical-layout theme="spacing" style="align-items: center; width: 100%; justify-content: center;">
     <label>Me gustas</label>
     <vista-mis_me_gusta style="height: 90%; width: 90%;"></vista-mis_me_gusta>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center;">
     <label>Comentarios</label>
     <vista-comentario style="width: 90%; height: 90%;"></vista-comentario>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-button style="margin-bottom: var(--lumo-space-xl);">
    Eliminar Publicacion
   </vaadin-button>
  </vaadin-vertical-layout>
  <vista-configurar style="height: 100%; width: 40%;"></vista-configurar>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
