import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mi_cabecera';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-comentario__usuario_registrado__item';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-comentario')
export class VistaComentario extends LitElement {
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
 <vista-mi_cabecera style="width: 100%; height: 10%;"></vista-mi_cabecera>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <img style="width: 100%; height: 100%;" src="../../resources/icons/video.png">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
   <iron-icon style="width: 30%; height: 30%;" icon="lumo:user"></iron-icon>
   <label id="idNombre">Usuario de la publicación </label>
   <vaadin-horizontal-layout style="width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; align-items: center;">
     <label id="idFechaPubli">Fecha </label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center;">
     <label id="idUbicacion">Ubicación </label>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-scroller style="height: 40%;">
    <vista-comentario__usuario_registrado__item></vista-comentario__usuario_registrado__item>
    <vista-comentario__usuario_registrado__item></vista-comentario__usuario_registrado__item>
    <vista-comentario__usuario_registrado__item></vista-comentario__usuario_registrado__item>
    <vista-comentario__usuario_registrado__item></vista-comentario__usuario_registrado__item>
   </vaadin-scroller>
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: flex-start;">
     <vaadin-button id="idVolver">
      Volver 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: flex-end;">
     <vaadin-button id="idAñadirCom">
      Añadir comentario 
     </vaadin-button>
    </vaadin-horizontal-layout>
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
